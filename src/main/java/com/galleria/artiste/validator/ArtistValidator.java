package com.galleria.artiste.validator;

import com.galleria.artiste.model.Artist;
import com.galleria.artiste.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ArtistValidator implements Validator {

  @Autowired
  private ArtistService artistService;

  @Override
  public boolean supports(Class<?> aClass) {
    return Artist.class.equals(aClass);
  }

  @Override
  public void validate(Object o, Errors errors) {
    Artist user = (Artist) o;

    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
    if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
      errors.rejectValue("username", "Size.userForm.username");
    }
    if (artistService.findByUsername(user.getUsername()) != null) {
      errors.rejectValue("username", "Duplicate.userForm.username");
    }

    if (artistService.findByEmail(user.getEmail()) != null) {
      errors.rejectValue("email", "Duplicate.userForm.email");
    }

    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
    if (user.getPassword().length() < 8 || user.getUsername().length() > 32) {
      errors.rejectValue("password", "Size.userForm.password");
    }
    if (!user.getConfirmPassword().equals(user.getPassword())) {
      errors.rejectValue("confirmPassword", "Diff.userForm.passwordConfirm");
    }
  }
}
