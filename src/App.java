import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        /** Задаем массив */
        int[] arrInt = new int[] {1, 3, 1, 5, 7, 7, 3, 2, 5, 7};
        /** Выводим массив на экран */
        System.out.print("Исходный список (");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print((arrInt[i] + ","));                   
        }
        System.out.print(")" + "\n");
        /** Создаем словарь для записи из массива. Размер словаря = размеру массива +1 */
        Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>(arrInt.length+1); 
        /** Обнуляем словарь, при это ключи - от 0 до размера массива */
        for (int i = 0; i < arrInt.length+1; i++) {
            arrMap.put(i, 0);
        }
        /** Заполняем словарь при совпадении ключа со значением массива, увеличиваем value словаря на единицу */
        for (int i = 0; i < arrInt.length; i++) {
            arrMap.put(arrInt[i], arrMap.get(arrInt[i])+1);            
        }        
        /** Выводим на экран не нулевые value из словаря, повторя их подсчитанное количество раз */
        System.out.print("Отсортир. список (");
        for (int i = 0; i < arrMap.size(); i++) {
            
            if (arrMap.get(i) != 0) {
                for (int j = 0; j < arrMap.get(i); j++) {
                    System.out.print((i + ","));    
                }                
            }
        }
        System.out.print(")" + "\n");
      }

      /** По-хорошему, надо бы убрать в конце лишнюю запятую, но это проблема вывода - стостепенная задача. 
       * Вместо хэшмэпа можно было использовать просто второй массив. Было бы даже проще
       */
}
