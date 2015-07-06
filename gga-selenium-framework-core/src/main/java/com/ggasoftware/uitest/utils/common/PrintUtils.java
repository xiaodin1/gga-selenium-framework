package com.ggasoftware.uitest.utils.common;

import java.util.Arrays;
import java.util.List;

import static com.ggasoftware.uitest.utils.common.LinqUtils.select;
import static java.lang.String.format;

/**
 * Created by roman.i on 30.09.2014.
 */
public class PrintUtils {
    public static String print(Iterable<String> list) { return print(list, ", ", "%s"); }
    public static String print(Iterable<String> list, String separator) { return print(list, separator, "%s"); }
    public static <T extends Enum> String printEnum(List<T> enums) {
        return (enums != null) ? String.join(", ", select(enums, el -> format("%s", el))) : "";
    }
    public static String print(Iterable<String> list, String separator, String format) {
        return (list != null) ? String.join(separator, select(list, el -> format(format, el))) : "";
    }
    public static String print(String[] list) { return print(list, ", ", "%s"); }
    public static String print(String[] list, String separator) { return print(list, separator, "%s"); }
    public static String print(String[] list, String separator, String format)  {
        return print(Arrays.asList(list), separator, format);
    }
    public static String printFields(Object obj) { return printFields(obj, "; "); }
    public static String printFields(Object obj, String separator) {
        String className = obj.getClass().getSimpleName();
        String params = print(select(ReflectionUtils.getFields(obj, String.class),
            field -> field.getName() + ": '" + ReflectionUtils.getFieldValue(field, obj) + "'"), separator, "%s");
        return format("%s(%s)", className, params);
    }
}