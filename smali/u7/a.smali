.class public Lu7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls7/g;)V
    .locals 0

    if-eqz p4, :cond_0

    invoke-static {p1}, Ls7/f;->b(Ljava/lang/String;)Ls7/f;

    move-result-object p1

    invoke-static {p2}, Ls7/f;->b(Ljava/lang/String;)Ls7/f;

    move-result-object p2

    invoke-interface {p4, p1, p2, p3}, Ls7/g;->a(Ls7/f;Ls7/f;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method b(Ls7/g;)V
    .locals 2

    const-string v0, "rbx.locale"

    const-string v1, " api failure"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0, v0, p1}, Lu7/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls7/g;)V

    return-void
.end method

.method c(Ljava/lang/String;ILs7/g;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ,response code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    const/16 v2, 0xc8

    if-ne p2, v2, :cond_0

    .line 2
    :try_start_0
    new-instance p2, Lv7/a;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v2}, Lv7/a;-><init>(Lorg/json/JSONObject;)V

    .line 3
    invoke-virtual {p2}, Lv7/a;->b()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p2}, Lv7/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p2}, Lv7/a;->c()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response code != 200, response code = "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    move-object p1, v0

    move-object v2, p1

    .line 8
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loginSignUpLocale = "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generalExperienceLocale = "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ugcLocale = "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    invoke-virtual {p0, v0, v2, p1, p3}, Lu7/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls7/g;)V

    return-void
.end method

.method public d(Ljava/util/Locale;Ls7/g;)V
    .locals 4

    const-string v0, "rbx.locale"

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceLocale: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Ln9/g;->d()Ln9/d;

    move-result-object v0

    invoke-static {}, Lh7/k;->a()Lh7/k;

    move-result-object v2

    invoke-virtual {v2}, Lh7/k;->b()Lob/d0;

    move-result-object v2

    invoke-interface {v0, v2}, Ln9/d;->e(Lob/d0;)Lr9/g;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lr9/g;->a(Ljava/lang/String;)Lgc/b;

    move-result-object p1

    new-instance v0, Lu7/a$a;

    invoke-direct {v0, p0, p2}, Lu7/a$a;-><init>(Lu7/a;Ls7/g;)V

    invoke-interface {p1, v0}, Lgc/b;->W(Lgc/d;)V

    goto :goto_0

    :cond_0
    const-string p1, "device locale null"

    .line 5
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p1, p1, p2}, Lu7/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls7/g;)V

    :goto_0
    return-void
.end method
