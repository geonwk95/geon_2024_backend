package day22.Step5;

public class Course {

    // 1. 모든 사람이면 등록가능      ?
    public static void registerCourse1( Applicant<?> applicant ){
        System.out.println( applicant.kind.getClass().getSimpleName() + " 이(가) Course1 등록함");
    }


    // 2. 학생만 등록가능            ? extends student : 본인타입 포함 하위타입 가능
    public static void registerCourse2( Applicant<? extends Student> applicant ){
        System.out.println( applicant.kind.getClass().getSimpleName() + " 이(가) Course2 등록함");
    }


    // 3. 직장인 및 일반인 등록가능   ? super  worker : 본인타입 포함 상위타입 가능
    public static void registerCourse3( Applicant<? super Worker> applicant ){
        System.out.println( applicant.kind.getClass().getSimpleName() + " 이(가) Course3 등록함");
    }


}
