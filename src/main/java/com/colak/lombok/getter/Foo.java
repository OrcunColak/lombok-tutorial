package com.colak.lombok.getter;

import lombok.Getter;
import lombok.experimental.Accessors;

// See https://stackoverflow.com/questions/42619986/lombok-annotation-getter-for-boolean-field
@Getter
public class Foo {

    // instead of isCanDelete(), getter is canDelete()
    @Accessors(fluent = true)
    boolean canDelete;

    public static void main() {
        Foo foo = new Foo();

        System.out.println(foo.canDelete());
    }
}
