package com.example.validator.val;

import com.example.validator.command.MemberCommand;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
//        return MemberCommand.class.isAssignableFrom(clazz);
        return clazz.isAssignableFrom(MemberCommand.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        MemberCommand command = (MemberCommand)target;
        if(command.getNick() == null || command.getNick().trim().equals("")){
            errors.rejectValue("nick", "nick.required", "no nick");
        }

//        if(command.getAge() == 0 || command.getAge() > 120){
//            errors.rejectValue("age", "age.required", "wrong age");
//        }

        if (command.getPass() == null || command.getPass().trim().equals("")){
            errors.rejectValue("pass", "pass.required", "no pass");
        }

        if (command.getPassConfig() == null || command.getPassConfig().trim().equals("")){
            errors.rejectValue("passConfig", "passConfig.required", "no pass2");
        }

        if (!command.getPass().equals(command.getPassConfig())){
            errors.rejectValue("passNotMatch", "passNotMatch.required", "not matched");
        }

        if (command.getEmail() == null || command.getEmail().trim().equals("")){
            errors.rejectValue("email", "email.required", "no email");
        }
    }
}
