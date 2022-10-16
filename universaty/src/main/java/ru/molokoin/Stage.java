package ru.molokoin;

public enum Stage {
    bachelor {
        @Override
        public String getStage() {
            return "bachelor";
        }
    },
    master {
        @Override
        public String getStage() {
            return "master";
        }
    };
    public abstract String getStage();
}
