package test10;

public class test {
  public static void main(String[] args) {
    String row = """
                <tr>
                    <th>이름</th>
                    <th>국어</th>
                    <th>영어</th>
                    <th>수학</th>
                    <th>총점</th>
                    <th>평균</th>
                    <th>성적</th>
                  </tr>
                """;

        String name = "ms";
        int kor = 1;
        int eng = 2;
        int math = 3;
        int total = kor + eng + math;
        double avg = total/3.0;
        String grade = "F";


        row = row.replace("이름", name);
        row = row.replace("국어", Integer.toString(kor));
        row = row.replace("영어", Integer.toString(eng));
        row = row.replace("수학", Integer.toString(math));
        row = row.replace("총점", Integer.toString(total));
        row = row.replace("평균", Double.toString(avg));
        row = row.replace("성적", grade);

        System.out.println(row); 
  }  
}
