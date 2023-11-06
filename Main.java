import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Person>persons = Data.getPersons();

        long count = persons.stream()
            .filter(p -> p.getEstimation() > 3) // Выполнить подсчет студентов, у которых оценка выше "Трех". 
            .count();

            System.out.println("Выполнить подсчет студентов, у которых оценка выше Трех:");
            System.out.println(count); 
            
        Optional <Person>person = persons.stream()
            .filter(p -> p.getEstimation() > 3) // Терминальный метод по поиску студента с оценкой больше трех.
           .findFirst();
           System.out.println(person.get()); 

            






        //List<Person> persons2 = persons.stream() // Создание Stream
            //.filter(p -> p.getEstimation() > 3) // конвейерный метод фильтрации оценки > 3. 
            //.sorted() // сортировка по ФИО.
            //.collect(Collectors.toList());


        //for(int i = 0; i < persons2.size(); i++){ // цикл вывода
            //System.out.println(persons2.get(i));
       // }

        
       
    }
} 