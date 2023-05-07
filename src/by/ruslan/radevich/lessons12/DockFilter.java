package by.ruslan.radevich.lessons12;

import java.io.File;
import java.io.FilenameFilter;

public class DockFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".doc");//тут пишем фильтр для поиска
    }
}
