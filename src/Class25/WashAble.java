package Class25;


    public interface WashAble {

        void wash();

    }

    class SmartWatch implements WashAble {

        @Override
        public void wash() {
            System.out.println("you can wash this smartwatch with out any issues");
        }
    }

    class Phone implements WashAble {
        @Override
        public void wash() {
            System.out.println("Iam IP65 Rated you can wash me ");
        }
    }
}
