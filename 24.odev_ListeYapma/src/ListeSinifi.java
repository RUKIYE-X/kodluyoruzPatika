public class ListeSinifi<T> {

        private T[] list;
        private int capacity;
        private int size;
        private boolean isEmpty = true;
        private boolean isVarMi = true;

        public ListeSinifi() {
            this.list = (T[]) new Object[10];
            this.size = 0;
            this.capacity = 10;
        }

        public ListeSinifi(int capacity) {
            this.list = (T[]) new Object[capacity];
            this.size = 0;
            this.capacity = capacity;
        }

        public int size() {
            return this.size;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public void add(T data) {
            if (this.size == this.getCapacity()) {
                T[] newArray = (T[]) new Object[capacity * 2];
                System.arraycopy(list, 0, newArray, 0, size);
                list = newArray;
                this.capacity *= 2;
            }
            list[size] = data;
            size++;

        }

        public T get(int index) {
            return this.list[index];
        }

        public Object remove(int index) {
            if (index < 0 || index > list.length) {

            } else {
                for (int i = index; i < list.length - 1; i++) {
                    list[i] = list[i + 1];
                }
                size -= 1;
            }
            return this.list[index];
        }

        public Object set(int index, T data) {
            if (index < 0 || index > list.length) {
                return null;
            } else {
                list[index] = data;
            }
            return this.list[index];
        }

        public String toString() {
            String print = "[";
            System.out.print(print);
            if(size != 0){
                for (int i = 1; i <= this.size; i++) {
                    if (i == this.size) {
                        System.out.print(list[i - 1]);
                        break;
                    }
                    System.out.print(this.list[i - 1] + ",");
                }
            }
            System.out.println("]");
            return print;
        }

        public int indexOf(T data) {
            for (int i = 0; i < list.length; i++) {
                if (data == this.list[i]) {
                    return i;
                }
            }
            return -1;
        }
        public int lastIndexOf(T data) {
            for (int i = list.length - 1; i >= 0; i--) {
                if (data == this.list[i]) {
                    return i;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            if(this.size == 0){
                return this.isEmpty;
            }
            return this.isEmpty = false;
        }

        public Object[] toArray(){
            Object[] arr = new Object[this.getCapacity()];
            for(int i = 0;i<this.size;i++){
                arr[i] = this.list[i];
                System.out.print(arr[i]+" ");
            }
            return arr;
        }

        public void clear(){
            this.size = 0;
        }

        public ListeSinifi<T> sublist(int start,int finish){
            ListeSinifi<T> tempArray = new ListeSinifi<>();
            for(int i = start;i<finish;i++){
                tempArray.add(this.list[i]);
            }
            return tempArray;
        }
        public boolean contains(T data){
            for(int i = 0;i<this.list.length;i++){
                if(data == this.list[i]){
                    return this.isVarMi;
                }
            }
            return this.isVarMi = false;
        }
    }


