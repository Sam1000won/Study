package Java_Study_05.Ex05;

import Java_Study_05.Ex03.KeyEvent;
import Java_Study_05.Ex03.MouseEvent;
public interface Child extends KeyEvent,MouseEvent {

        public void textField(String test);
        public void selectOne();
        public void checkOne();
    
} 