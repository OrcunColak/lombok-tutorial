import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

// See https://medium.com/@rabinarayandev/enhance-java-with-extensionmethod-in-lombok-clean-and-concise-utility-methods-47469de81837
@ExtensionMethod({StringUtils.class, CollectionUtils.class})
public class DataValidator {
    public static void main(String[] args) {
        List<String> items = List.of();
        String input = " ";
        
        // Using @ExtensionMethod for String and Collection utilities
        if (input.isEmpty()) {
            System.out.println("Input is empty");
        }

        if (items.isEmpty()) {
            System.out.println("Items list is empty");
        }
    }
}
