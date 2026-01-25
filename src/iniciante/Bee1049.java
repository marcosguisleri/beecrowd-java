package iniciante;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Bee1049 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();

        if (Objects.equals(s1, "vertebrado")) {
            if (Objects.equals(s2, "ave")) {
                if (Objects.equals(s3, "carnivoro")) {
                    System.out.println("aguia");
                    return;
                } else if (Objects.equals(s3, "onivoro")) {
                    System.out.println("pomba");
                    return;
                }
            } else if (Objects.equals(s2, "mamifero")) {
                if (Objects.equals(s3, "onivoro")) {
                    System.out.println("homem");
                    return;
                } else if (Objects.equals(s3, "herbivoro")) {
                    System.out.println("vaca");
                    return;
                }
            }
        } else if (Objects.equals(s1, "invertebrado")) {
            if (Objects.equals(s2, "inseto")) {
                if (Objects.equals(s3, "hematofago")) {
                    System.out.println("pulga");
                    return;
                } else if (Objects.equals(s3, "herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (Objects.equals(s2, "anelideo")) {
                if (Objects.equals(s3, "hematofago")) {
                    System.out.println("sanguessuga");
                } else if (Objects.equals(s3, "onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

    }

}
