package org.zjl.jeddit.user.domain.model.valueobjects;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.zjl.jeddit.user.domain.exceptions.InvalidPhoneException;

/**
 * @author Junlin Zhou
 */
@Value
@AllArgsConstructor
public class IdCard {

    String number;

    /**
     * Extra rules may be added.
     */
    private static boolean isValid(String phone) {
        return true;
    }

    public static IdCard construct(String number) {
        if (number == null) {
            throw new InvalidPhoneException();
        }
        if (!isValid(number)) {
            throw new InvalidPhoneException();
        }
        return new IdCard(number);
    }
}
