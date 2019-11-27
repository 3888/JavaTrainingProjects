package TrainingProjects.logicUpgrade.projecteuler;

public class Problem003Account {

    private  String userId;
    private  String token;

    private Problem003Account() {
        // private constructor
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public static Builder newBuilder() {
        return new Problem003Account().new Builder();
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setUserId(String userId) {
            Problem003Account.this.userId = userId;

            return this;
        }

        public Builder setToken(String token) {
            Problem003Account.this.token = token;

            return this;
        }

        public Problem003Account build() {
            return Problem003Account.this;
        }

    }
}