.class Lcom/roblox/client/signup/a$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/signup/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/signup/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "y"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/signup/a;


# direct methods
.method private constructor <init>(Lcom/roblox/client/signup/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/client/signup/a;Lcom/roblox/client/signup/a$k;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/client/signup/a$y;-><init>(Lcom/roblox/client/signup/a;)V

    return-void
.end method

.method private c(IJ)V
    .locals 2

    .line 1
    invoke-static {}, Lx7/g;->e()Lx7/g;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Lx7/g;->k(Ljava/lang/String;J)V

    .line 2
    iget-object p2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object p3, p2, Lcom/roblox/client/signup/a;->u1:Lcom/roblox/client/signup/a$x;

    invoke-static {p2}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v0}, Lcom/roblox/client/signup/a;->J2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, p2, v0}, Lcom/roblox/client/signup/a$x;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lx7/e;->g(I)V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/client/signup/f;)V
    .locals 2

    .line 1
    iget-wide v0, p1, Lcom/roblox/client/signup/f;->g:J

    .line 2
    iget p1, p1, Lcom/roblox/client/signup/f;->d:I

    invoke-direct {p0, p1, v0, v1}, Lcom/roblox/client/signup/a$y;->c(IJ)V

    return-void
.end method

.method public b(Lcom/roblox/client/signup/f;)V
    .locals 13

    const-string v0, "Captcha"

    const-string v1, "FailureUnknownError"

    const-string v2, "Android-AppSignup-UnknownError"

    const/4 v3, 0x0

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {p1}, Lcom/roblox/client/signup/a;->W2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/roblox/client/signup/f;

    invoke-direct {p1}, Lcom/roblox/client/signup/f;-><init>()V

    .line 3
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    .line 4
    iput-object v2, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 5
    :cond_0
    iget-object v4, p1, Lcom/roblox/client/signup/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-eqz v4, :cond_11

    iget-object v4, p1, Lcom/roblox/client/signup/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    goto/16 :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->w()Landroid/content/Context;

    move-result-object v1

    .line 7
    iget-object v4, p1, Lcom/roblox/client/signup/f;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "UsernameTaken"

    .line 8
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 9
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v2}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v4

    sget v5, Lcom/roblox/client/c0;->b2:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v1, "FailureAlreadyTaken"

    .line 10
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-UsernameTaken"

    .line 11
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_2
    const-string v5, "UsernameContainsInvalidCharacters"

    .line 12
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 13
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v2

    iget-object v4, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v4}, Lcom/roblox/client/signup/a;->Z2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2, v4}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v1, "FailureInvalidCharacters"

    .line 14
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-UsernameInvalidChars"

    .line 15
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_3
    const-string v5, "UsernameCannotContainSpaces"

    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 17
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v2}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v4

    sget v5, Lcom/roblox/client/c0;->c2:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v1, "FailureContainsSpaces"

    .line 18
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-UsernameWithSpaces"

    .line 19
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_4
    const-string v5, "UsernameInvalid"

    .line 20
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 21
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v2}, Lcom/roblox/client/signup/a;->E2(Lcom/roblox/client/signup/a;)Lcom/roblox/client/signup/UsernameSignUpEditText;

    move-result-object v4

    sget v5, Lcom/roblox/client/c0;->f2:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v1, "FailureInvalidUsername"

    .line 22
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-UsernameInvalid"

    .line 23
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_5
    const-string v5, "BirthdayInvalid"

    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 25
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object v1, v1, Lcom/roblox/client/signup/a;->c1:Lcom/roblox/client/components/RbxBirthdayPicker;

    invoke-virtual {v1}, Lcom/roblox/client/components/RbxBirthdayPicker;->q()V

    const-string v1, "FailureInvalidBirthday"

    .line 26
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-InvalidBirthday"

    .line 27
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_6
    const-string v5, "GenderInvalid"

    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 29
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object v1, v1, Lcom/roblox/client/signup/a;->b1:Lcom/roblox/client/components/RbxGenderPicker;

    invoke-virtual {v1}, Lcom/roblox/client/components/RbxGenderPicker;->p()V

    const-string v1, "FailureInvalidGender"

    .line 30
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-InvalidGender"

    .line 31
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_7
    const-string v5, "PasswordInvalid"

    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 33
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object v4, v2, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v5, Lcom/roblox/client/c0;->R1:I

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v1, v5, v6}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    const-string v1, "FailureInvalidPassword"

    .line 34
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-PasswordInvalid"

    .line 35
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    .line 36
    :cond_8
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    if-eqz v1, :cond_9

    .line 37
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->a3(Lcom/roblox/client/signup/a;)V

    :cond_9
    const-string v1, "FailureAccountCreateFloodcheck"

    .line 38
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-Captcha"

    .line 39
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_a
    const-string v5, "StatusJsonError"

    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 41
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->b3(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    const-string v1, "FailureJSONParse"

    .line 42
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-JsonError"

    .line 43
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_b
    const-string v5, "StatusThrottled"

    .line 44
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 45
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-virtual {v1}, Lcom/roblox/client/signup/a;->K3()V

    const-string v1, "FailureStatusThrottled"

    .line 46
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-Throttled"

    .line 47
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto/16 :goto_1

    :cond_c
    const-string v5, "StatusServerError"

    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 49
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->c3(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    const-string v1, "FailureServerError"

    .line 50
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-ServerError"

    .line 51
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto :goto_1

    :cond_d
    const-string v5, "StatusUserIdInvalid"

    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 53
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->c3(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    const-string v1, "MissingUserInfo"

    .line 54
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-UserIdInvalid"

    .line 55
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto :goto_1

    :cond_e
    const-string v5, "PasswordMatchesUsername"

    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    .line 57
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object v4, v2, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v6, Lcom/roblox/client/c0;->Q1:I

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v1, v6, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 58
    iput-object v5, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-PasswordMatchesUsername"

    .line 59
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto :goto_1

    :cond_f
    const-string v5, "DumbPassword"

    .line 60
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    .line 61
    iget-object v2, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    iget-object v4, v2, Lcom/roblox/client/signup/a;->Z0:Lcom/roblox/client/components/RbxEditText;

    sget v6, Lcom/roblox/client/c0;->N1:I

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v1, v6, v7}, Lt7/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v4, v1}, Lcom/roblox/client/signup/a;->I2(Lcom/roblox/client/signup/a;Lcom/roblox/client/components/RbxEditText;Ljava/lang/String;)V

    .line 62
    iput-object v5, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    const-string v1, "Android-AppSignup-DumbPassword"

    .line 63
    iput-object v1, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto :goto_1

    .line 64
    :cond_10
    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v1}, Lcom/roblox/client/signup/a;->d3(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    .line 65
    iput-object v2, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    goto :goto_1

    .line 66
    :cond_11
    :goto_0
    iget-object v4, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v4}, Lcom/roblox/client/signup/a;->W2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/roblox/client/signup/a;->Y2(Lcom/roblox/client/signup/a;Ljava/lang/String;)V

    .line 67
    iput-object v1, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    .line 68
    iput-object v2, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    .line 69
    :goto_1
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object v4

    iget-object v5, p1, Lcom/roblox/client/signup/f;->c:Ljava/lang/String;

    iget-object v6, p1, Lcom/roblox/client/signup/f;->b:Ljava/lang/String;

    iget v7, p1, Lcom/roblox/client/signup/f;->d:I

    iget-object v8, p1, Lcom/roblox/client/signup/f;->e:Ljava/lang/String;

    iget-object v9, p1, Lcom/roblox/client/signup/f;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    .line 70
    invoke-static {v1}, Lcom/roblox/client/signup/a;->H2(Lcom/roblox/client/signup/a;)Ljava/lang/String;

    move-result-object v10

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v11, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-static {v11}, Lcom/roblox/client/signup/a;->O2(Lcom/roblox/client/signup/a;)J

    move-result-wide v11

    sub-long v11, v1, v11

    .line 72
    invoke-virtual/range {v4 .. v12}, Lx7/e;->f(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 73
    iget-object p1, p1, Lcom/roblox/client/signup/f;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    .line 74
    iget-object p1, p0, Lcom/roblox/client/signup/a$y;->a:Lcom/roblox/client/signup/a;

    invoke-virtual {p1}, Lcom/roblox/client/signup/a;->L3()V

    :cond_12
    return-void
.end method
