package cn.edu.tust.utils;

import cn.edu.tust.pojo.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {
    private final static String excel2003L =".xls";    //2003- 版本的excel
    private final static String excel2007U =".xlsx";   //2007+ 版本的excel



    public static List<CourseClass> getCourseClass(InputStream in, String fileName)throws Exception{
        List<CourseClass> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CourseClass>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CourseClass courseClass = new CourseClass();
                courseClass.setClass_id(formatter.formatCellValue(row.getCell(0)));
                courseClass.setCourse_id(formatter.formatCellValue(row.getCell(1)));
                courseClass.setCourse_num(formatter.formatCellValue(row.getCell(2)));
                courseClass.setCourse_name(formatter.formatCellValue(row.getCell(3)));
                courseClass.setCourse_prop(formatter.formatCellValue(row.getCell(4)));
                list.add(courseClass);

            }
        }
        work.close();
        return list;
    }

    public static List<CoursePE> getCoursePE(InputStream in, String fileName) throws Exception{
        List<CoursePE> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CoursePE>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CoursePE coursePE = new CoursePE();
                coursePE.setGrade(formatter.formatCellValue(row.getCell(0)));
                coursePE.setFaculty(formatter.formatCellValue(row.getCell(1)));
                coursePE.setCourse_id(formatter.formatCellValue(row.getCell(2)));
                coursePE.setCourse_num(formatter.formatCellValue(row.getCell(3)));
                coursePE.setCourse_name(formatter.formatCellValue(row.getCell(4)));
                coursePE.setCourse_teacher(formatter.formatCellValue(row.getCell(5)));
                coursePE.setWeek(formatter.formatCellValue(row.getCell(6)));
                coursePE.setLesson(formatter.formatCellValue(row.getCell(7)));
                coursePE.setStart_stop_week(formatter.formatCellValue(row.getCell(8)));
                coursePE.setCampus(formatter.formatCellValue(row.getCell(9)));
                coursePE.setCourse_capacity(formatter.formatCellValue(row.getCell(10)));

                list.add(coursePE);
            }
        }
        work.close();
        return list;
    }

    public static List<CourseGeneral> getCourseGeneral(InputStream in, String fileName) throws Exception{
        List<CourseGeneral> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CourseGeneral>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }

            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CourseGeneral courseGeneral = new CourseGeneral();
                courseGeneral.setCampus(formatter.formatCellValue(row.getCell(0)));
                courseGeneral.setCourse_id(formatter.formatCellValue(row.getCell(1)));
                courseGeneral.setCourse_num(formatter.formatCellValue(row.getCell(2)));
                courseGeneral.setCourse_times(formatter.formatCellValue(row.getCell(3)));
                courseGeneral.setCourse_class(formatter.formatCellValue(row.getCell(4)));
                courseGeneral.setWeek(formatter.formatCellValue(row.getCell(5)));
                courseGeneral.setLesson(formatter.formatCellValue(row.getCell(6)));
                courseGeneral.setClassroom(formatter.formatCellValue(row.getCell(7)));
                courseGeneral.setProperty(formatter.formatCellValue(row.getCell(8)));
                courseGeneral.setCourse_name(formatter.formatCellValue(row.getCell(9)));
                courseGeneral.setCourse_teacher(formatter.formatCellValue(row.getCell(10)));
                courseGeneral.setStart_stop_week(formatter.formatCellValue(row.getCell(11)));
                courseGeneral.setCredit(formatter.formatCellValue(row.getCell(12)));
                courseGeneral.setCourse_period(formatter.formatCellValue(row.getCell(13)));
                courseGeneral.setCourse_limit(formatter.formatCellValue(row.getCell(14)));

                list.add(courseGeneral);
            }
        }
        work.close();
        return list;
    }

    public static List<CourseLevel> getCourseLevel(InputStream in, String fileName) throws Exception{
        List<CourseLevel> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CourseLevel>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CourseLevel courseLevel = new CourseLevel();
                courseLevel.setFaculty(formatter.formatCellValue(row.getCell(0)));
                courseLevel.setClass_id(formatter.formatCellValue(row.getCell(1)));
                courseLevel.setStudent_id(formatter.formatCellValue(row.getCell(2)));
                courseLevel.setStudent_name(formatter.formatCellValue(row.getCell(3)));
                courseLevel.setCourse_level(formatter.formatCellValue(row.getCell(4)));
                courseLevel.setRemark(formatter.formatCellValue(row.getCell(5)));

                list.add(courseLevel);
            }
        }
        work.close();
        return list;
    }

    public static List<CourseEnglish> getCourseEnglish(InputStream in, String fileName) throws Exception{
        List<CourseEnglish> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CourseEnglish>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CourseEnglish courseEnglish = new CourseEnglish();
                courseEnglish.setFaculty(formatter.formatCellValue(row.getCell(0)));
                courseEnglish.setCourse_id(formatter.formatCellValue(row.getCell(1)));
                courseEnglish.setCourse_num(formatter.formatCellValue(row.getCell(2)));
                courseEnglish.setCourse_name(formatter.formatCellValue(row.getCell(3)));
                courseEnglish.setCourse_teacher(formatter.formatCellValue(row.getCell(4)));
                courseEnglish.setRemark(formatter.formatCellValue(row.getCell(5)));

                list.add(courseEnglish);
            }
        }
        work.close();
        return list;
    }

    public static List<CourseComputer> getCourseComputer(InputStream in, String fileName) throws Exception{
        List<CourseComputer> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<CourseComputer>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                CourseComputer courseComputer = new CourseComputer();
                courseComputer.setFaculty(formatter.formatCellValue(row.getCell(0)));
                courseComputer.setCourse_id(formatter.formatCellValue(row.getCell(1)));
                courseComputer.setCourse_num(formatter.formatCellValue(row.getCell(2)));
                courseComputer.setCourse_name(formatter.formatCellValue(row.getCell(3)));
                courseComputer.setCourse_teacher(formatter.formatCellValue(row.getCell(4)));
                courseComputer.setRemark(formatter.formatCellValue(row.getCell(5)));

                list.add(courseComputer);
            }
        }
        work.close();
        return list;
    }

    public static List<DataTeacher> getDataTeacher(InputStream in, String fileName) throws Exception{
        List<DataTeacher> list = null;
        DataFormatter formatter = new DataFormatter();
        //创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        list = new ArrayList<DataTeacher>();
        //遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            //遍历当前sheet中的所有行
            //包涵头部，所以要小于等于最后一列数,这里也可以在初始值加上头部行数，以便跳过头部
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                //读取一行
                row = sheet.getRow(j);
                //去掉空行和表头
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                DataTeacher dataTeacher = new DataTeacher();
                dataTeacher.setTeacher_name(formatter.formatCellValue(row.getCell(0)));
                dataTeacher.setTeacher_title(formatter.formatCellValue(row.getCell(1)));
                dataTeacher.setTeacher_course(formatter.formatCellValue(row.getCell(2)));
                dataTeacher.setTeacher_resume(formatter.formatCellValue(row.getCell(3)));

                list.add(dataTeacher);
            }
        }
        work.close();
        return list;
    }

    private static  Workbook getWorkbook(InputStream inStr, String fileName) throws Exception{
        Workbook wb = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if(excel2003L.equals(fileType)){
            wb = new HSSFWorkbook(inStr);  //2003-
        }else if(excel2007U.equals(fileType)){
            wb = new XSSFWorkbook(inStr);  //2007+
        }else{
            throw new Exception("解析的文件格式有误！");
        }
        return wb;
    }


}
