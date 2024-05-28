.class public Lt8/b;
.super Lt8/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lx7/e;Lcom/roblox/client/signup/a$z;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt8/c;-><init>(Lx7/e;Lcom/roblox/client/signup/a$z;)V

    return-void
.end method

.method private f(I)Ljava/lang/String;
    .locals 8

    const/16 v0, 0xa

    const-string v1, "ContainsPII"

    const-string v2, "UnknownError"

    const-string v3, "ContainInvalidCharacters"

    const-string v4, "ContainSpaces"

    const-string v5, "MoreThanOneUnderscore"

    const-string v6, "StartingOrEndingWithUnderscore"

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 1
    sget p1, Lcom/roblox/client/c0;->m2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameUnknownError"

    move-object v0, v2

    goto :goto_0

    .line 2
    :pswitch_0
    sget p1, Lcom/roblox/client/c0;->d2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameContainsInvalidCharacters"

    move-object v0, v3

    goto :goto_0

    .line 3
    :pswitch_1
    sget p1, Lcom/roblox/client/c0;->c2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameContainsSpaces"

    move-object v0, v4

    goto :goto_0

    .line 4
    :pswitch_2
    sget p1, Lcom/roblox/client/c0;->l2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameContainsMoreThanOneUnderscore"

    move-object v0, v5

    goto :goto_0

    .line 5
    :pswitch_3
    sget p1, Lcom/roblox/client/c0;->h2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameStartingOrEndingWithUnderscore"

    move-object v0, v6

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 6
    :pswitch_4
    sget p1, Lcom/roblox/client/c0;->i2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string v1, "InvalidLength"

    const-string p1, "Android-AppSignup-Validation-UsernameInvalidLength"

    const-string v0, "UsernameInvalidLength"

    goto :goto_1

    .line 7
    :pswitch_5
    sget p1, Lcom/roblox/client/c0;->e2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string v1, "Explicit"

    const-string p1, "Android-AppSignup-Validation-UsernameExplicit"

    const-string v0, "UsernameModerated"

    goto :goto_1

    .line 8
    :pswitch_6
    invoke-virtual {p0}, Lt8/c;->c()V

    const-string v1, "Taken"

    const-string p1, "Android-AppSignup-Validation-UsernameTaken"

    const-string v0, "UsernameTaken"

    goto :goto_1

    .line 9
    :pswitch_7
    sget p1, Lcom/roblox/client/c0;->M1:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->e(Ljava/lang/Integer;)V

    const-string v1, ""

    const-string p1, "Success"

    const-string v0, "Android-AppSignup-Validation-UsernameSuccess"

    move-object v7, v1

    move-object v1, p1

    move-object p1, v0

    move-object v0, v7

    goto :goto_1

    .line 10
    :cond_0
    sget p1, Lcom/roblox/client/c0;->e2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string v1, "Reserved"

    const-string p1, "Android-AppSignup-Validation-UsernameReserved"

    const-string v0, "UsernameReserved"

    goto :goto_1

    .line 11
    :cond_1
    sget p1, Lcom/roblox/client/c0;->j2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    const-string p1, "Android-AppSignup-Validation-UsernameContainsPII"

    move-object v0, v1

    .line 12
    :goto_1
    iget-object v2, p0, Lt8/c;->a:Lx7/e;

    invoke-virtual {v2, p1}, Lx7/e;->A(Ljava/lang/String;)V

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "analyticsLabel: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", diagCounterName: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "rbx.signup"

    invoke-static {v1, p1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private g(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, Lcom/roblox/client/c0;->m2:I

    const-string v1, "Android-AppSignup-Validation-UsernameUnknownError"

    const-string v2, "UnknownError"

    :try_start_0
    const-string v3, "errors"

    .line 2
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v3, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 4
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "code"

    const/4 v6, -0x1

    .line 5
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 6
    sget v0, Lcom/roblox/client/c0;->k2:I

    const-string v1, "Android-AppSignup-Validation-UsernameRequiredError"

    const-string v2, "Username is required"

    goto :goto_1

    :cond_0
    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    .line 7
    sget v0, Lcom/roblox/client/c0;->I1:I

    const-string v1, "Android-AppSignup-Validation-UsernameBirthDateRequired"

    const-string v2, "Birthday is required"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 9
    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    .line 10
    iget-object p1, p0, Lt8/c;->a:Lx7/e;

    invoke-virtual {p1, v1}, Lx7/e;->A(Ljava/lang/String;)V

    return-object v2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh7/j;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/roblox/client/p0;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 2
    invoke-static {p1, p2, p2, p2}, Lh7/b;->k(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;Ljava/lang/String;)Lh7/j;

    move-result-object p1

    return-object p1
.end method

.method public b(ILorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    const-string v0, "code"

    .line 1
    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    .line 2
    invoke-direct {p0, p1}, Lt8/b;->f(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/16 v0, 0x190

    if-ne p1, v0, :cond_1

    .line 3
    invoke-direct {p0, p2}, Lt8/b;->g(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_1
    sget p1, Lcom/roblox/client/c0;->m2:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt8/c;->d(Ljava/lang/Integer;)V

    .line 5
    iget-object p1, p0, Lt8/c;->a:Lx7/e;

    const-string p2, "Android-AppSignup-Validation-UsernameUnknownError"

    invoke-virtual {p1, p2}, Lx7/e;->A(Ljava/lang/String;)V

    const-string p1, "UnknownError"

    :goto_0
    return-object p1
.end method
