package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun  emailValidator_DoubleEt_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email@email.com"))
    }

    @Test
    fun emailValidator_LongName_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("verylongmailverylongmailverylongmailverylongmailverylongmailverylongmail@mail.com"))
    }

    @Test
    fun emailValidator_MirrorEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("moc.liame@eman"))
    }

    @Test
    fun emailValidator_RussianLetter_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email.сom"))
    }

    @Test
    fun emailValidator_CommaInsteadOfDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email,com"))
    }

    @Test
    fun emailValidator_CyrillicEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("имя@мыло.ком"))
    }

    @Test
    fun emailValidator_BlankName_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("    @mail.com"))
    }
}
