package ru.molokoin;

public enum Degree {
    PhD {
        @Override
        public String getDegree() {
            return "PhD";
        }
    },
    MSc {
        @Override
        public String getDegree() {
            return "MSc";
        }
    };
    public abstract String getDegree();
}
