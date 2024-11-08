package modulo01_08;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args){
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("aluno 1");
        for (String aluno:alunos){
            System.out.println(aluno);
        }
    }
}
