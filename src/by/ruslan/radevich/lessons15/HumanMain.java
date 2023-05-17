package by.ruslan.radevich.lessons15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Men", 10);
        Human father = new Human("Father", 40);
        Human mother = new Human("Mother", 35);
        Human anonim = new Human(null, 50);
        human.setFather(father);
        human.setMother(mother);
        System.out.println(human);
        System.out.println(anonim);
        System.out.println(human.getFather().getName());
        // System.out.println(human.getFather().getFather().getName());

        if (human.getFather() != null && human.getFather().getFather() != null && human.getFather().getFather().getName()!=null){
            System.out.println(human.getFather().getFather().getName());
        }else {
            System.out.println("unknow name");
        }
        Optional<Human>fatherOpt = Optional.ofNullable(anonim.getFather());
        if(fatherOpt.isPresent()){
            System.out.println(fatherOpt.get().getName());
        }
        fatherOpt.ifPresent(f-> System.out.println(f.getName()));
       // Human possibleFathet =  fatherOpt.orElseThrow();//проверка есть что то или нет
        //Human possibleFathet =  fatherOpt.orElseThrow(()->new RuntimeException("Here")); вариант что бы написать ошибку самому
        fatherOpt.ifPresentOrElse(fOpt-> System.out.println(fOpt.getName()),//проверяет и пишет то что хочу если ничего не находит
                ()-> System.out.println("Anonim"));

        Human protector = new Human("Prot",100);
        Human ourDef = fatherOpt.orElse(protector);
        Optional.ofNullable(human.getFather())
                .orElse(getDefaultHuman());
        Optional.ofNullable(human.getFather())
                .orElseGet(HumanMain::getDefaultHuman);

        fatherOpt.map(f-> f.getFather())//проверяем есть ли отец
                .map(f->f.getFather())//дед
                .ifPresent(ded-> System.out.println(ded.getName()));//пишем имя деда

        Optional.ofNullable(human).map(Human::getFather)
                .filter(f->f.getName().startsWith("ab"))
                .ifPresent(f-> System.out.println(f));//выводим отца если имя начинается с ab

        if(human.getFather()!=null&&human.getFather().getName()!=null
        &&human.getFather().getName().startsWith("ab")){
            System.out.println(human.getName());//выводим отца если имя начинается с ab по старому
        }
    }
    private static Human getDefaultHuman(){
        System.out.println("This is default human");
        return new Human("Prot",100);
    }
}
