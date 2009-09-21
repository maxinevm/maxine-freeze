/*
 * Copyright (c) 2007 Sun Microsystems, Inc.  All rights reserved.
 *
 * Sun Microsystems, Inc. has intellectual property rights relating to technology embodied in the product
 * that is described in this document. In particular, and without limitation, these intellectual property
 * rights may include one or more of the U.S. patents listed at http://www.sun.com/patents and one or
 * more additional patents or pending patent applications in the U.S. and in other countries.
 *
 * U.S. Government Rights - Commercial software. Government users are subject to the Sun
 * Microsystems, Inc. standard license agreement and applicable provisions of the FAR and its
 * supplements.
 *
 * Use is subject to license terms. Sun, Sun Microsystems, the Sun logo, Java and Solaris are trademarks or
 * registered trademarks of Sun Microsystems, Inc. in the U.S. and other countries. All SPARC trademarks
 * are used under license and are trademarks or registered trademarks of SPARC International, Inc. in the
 * U.S. and other countries.
 *
 * UNIX is a registered trademark in the U.S. and other countries, exclusively licensed through X/Open
 * Company, Ltd.
 */
package test.com.sun.max.vm.jit;

import test.com.sun.max.vm.compiler.*;

import com.sun.max.vm.template.source.*;
import com.sun.max.vm.type.*;


/**
 * Compiles all tests from test.jdk.
 *
 * @author Laurent Daynes
 */
public class JITTest_compileJDKTest  extends JitCompilerTestCase {

    public void test_compileGetName() {
        compileMethod("getName", SignatureDescriptor.create("(I)Ljava/lang/String;"));
    }

    public static String getName(int a) {
        if (a == 0) {
            return String.class.getName();
        }
        return "";
    }

    @Override
    protected Class[] templateSources() {
        return TemplateTableConfiguration.OPTIMIZED_TEMPLATE_SOURCES;
    }

}
