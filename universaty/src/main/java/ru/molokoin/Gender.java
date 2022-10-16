package ru.molokoin;
/**
 * Перечисление gender,
 * 
 */
public enum Gender {
    MALE {
        public String getPronoun(){
            return "he";
        }
    },
    FEMALE{
        public String getPronoun(){
            return "she";
        }
    },
    TRANS{
        public String getPronoun() {
            return "it";
        }
    };
    public abstract String getPronoun();
}
