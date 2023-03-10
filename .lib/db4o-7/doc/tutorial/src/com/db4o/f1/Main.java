package com.db4o.f1;

import com.db4o.f1.chapter1.*;
import com.db4o.f1.chapter2.*;
import com.db4o.f1.chapter3.*;
import com.db4o.f1.chapter4.*;
import com.db4o.f1.chapter5.*;


public class Main {
    public static void main(String[] args) throws Exception {
        FirstStepsExample.main(args);
        QueryExample.main(args);
        StructuredExample.main(args);
        CollectionsExample.main(args);
        InheritanceExample.main(args);
        DeepExample.main(args);
        TransactionExample.main(args);
        ClientServerExample.main(args);
    }
}
