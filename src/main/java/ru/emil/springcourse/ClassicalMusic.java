package ru.emil.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void musicInit() throws InterruptedException{
        System.out.print("Wait");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
        System.out.print("\n");
        System.out.println("Initialization complete!");
    }
    public void musicDestroy() throws InterruptedException{
        System.out.print("Wait");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
        System.out.print("\n");
        System.out.println("Destroying done!");
    }

    private ClassicalMusic() {}
}
