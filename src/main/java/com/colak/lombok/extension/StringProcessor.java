import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;

// See https://medium.com/@rabinarayandev/enhance-java-with-extensionmethod-in-lombok-clean-and-concise-utility-methods-47469de81837
@ExtensionMethod(StringUtils.class)
public class StringProcessor {
    public static void main(String[] args) {
        String str = " Lombok ";
        
        // Using @ExtensionMethod, trim() behaves like a native method of String
        String trimmedString = str.trim();  // Looks cleaner and more readable
        System.out.println(trimmedString);
    }
}
