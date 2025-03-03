import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;

// See https://medium.com/@rabinarayandev/enhance-java-with-extensionmethod-in-lombok-clean-and-concise-utility-methods-47469de81837
@ExtensionMethod({StringUtils.class, Math.class})
public class UtilityProcessor {
  
    public static void main(String[] args) {
        String str = " Hello World ";
        String trimmedString = str.trim();  // Calls StringUtils.trim()
        System.out.println(trimmedString);

        int value = -10;
        int absValue = value.abs();  // Calls Math.abs()
        System.out.println(absValue);
    }
}
