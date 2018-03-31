package com.kof

import com.ledo.Dog
import com.ledo.TestUtil
import org.junit.Assert
import org.junit.Test

/**
 * @author Jiahe Cai
 */
class JavaTypeIsAssignableFromKotlinTypeTest {

    @Test
    fun isAssignableFromBooleanClass() {
        Assert.assertEquals(false, TestUtil.isAssignableFromBooleanClass(Boolean::class.java))
    }

    @Test
    fun isAssignableFromBooleanType() {
        Assert.assertEquals(true, TestUtil.isAssignableFromBooleanType(Boolean::class.java))
    }

    @Test
    fun isAssignableFromMyClass() {
        Assert.assertEquals(true, TestUtil.isAssignableFromMyClass(Dog::class.java))
    }

}