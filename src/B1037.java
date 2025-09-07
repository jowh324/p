import java.io.*;

public class B1037 {

        enum ResistorColor {
            black(0, 1),
            brown(1, 10),
            red(2, 100),
            orange(3, 1_000),
            yellow(4, 10_000),
            green(5, 100_000),
            blue(6, 1_000_000),
            violet(7, 10_000_000),
            grey(8, 100_000_000),
            white(9, 1_000_000_000);

            private final int value;
            private final int multiplier;
            ResistorColor(int value, int multiplier) { this.value = value; this.multiplier = multiplier; }
            public int getValue() { return value; }
            public int getMultiplier() { return multiplier; }

            public static ResistorColor from(String s) {
                if (s == null) throw new IllegalArgumentException("color is null");
                return ResistorColor.valueOf(s.trim().toLowerCase());
            }
        }

        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                String color1 = br.readLine();
                String color2 = br.readLine();
                String color3 = br.readLine();

                ResistorColor first  = ResistorColor.from(color1);
                ResistorColor second = ResistorColor.from(color2);
                ResistorColor mult   = ResistorColor.from(color3);

                long base = first.getValue() * 10L + second.getValue();
                long result = base * (long) mult.getMultiplier();
                System.out.println(result);
            } catch (IOException | IllegalArgumentException e) {
                System.out.println("INVALID");
            }
        }

}
