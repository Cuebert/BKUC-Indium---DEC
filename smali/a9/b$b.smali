.class La9/b$b;
.super Lh7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/b;->d(Ljava/lang/String;La9/b$c;)Lh7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La9/b$c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:La9/b;


# direct methods
.method constructor <init>(La9/b;La9/b$c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La9/b$b;->c:La9/b;

    iput-object p2, p0, La9/b$b;->a:La9/b$c;

    iput-object p3, p0, La9/b$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Lh7/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lh7/j;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "rbx.2sv"

    const/4 v3, 0x0

    const-string v4, "FailureUnknownError"

    const/16 v5, -0x3e8

    const/4 v6, 0x0

    const/16 v7, 0xc8

    if-ne v0, v7, :cond_0

    const-string v0, "callAuthVerify2SVCode. 2SV code verified."

    .line 2
    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v0, p0, La9/b$b;->c:La9/b;

    iget-object v0, v0, La9/b;->a:Lx7/e;

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lx7/e;->b(I)V

    .line 4
    iget-object v0, p0, La9/b$b;->a:La9/b$c;

    const-wide/16 v7, -0x1

    invoke-interface {v0, v7, v8}, La9/b$c;->e(J)V

    :goto_0
    const/4 v1, 0x0

    goto :goto_3

    .line 5
    :cond_0
    :try_start_0
    new-instance v7, La9/b$d;

    invoke-virtual {p1}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, La9/b$d;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v9, v7

    move-object v7, v3

    move-object v3, v9

    goto :goto_1

    :catch_0
    const-string v7, "FailureJSON"

    :goto_1
    if-eqz v3, :cond_8

    const/16 v7, 0x190

    if-eq v0, v7, :cond_5

    const/16 v1, 0x1ad

    if-eq v0, v1, :cond_3

    const/16 v1, 0x1f7

    if-eq v0, v1, :cond_1

    :goto_2
    move-object v3, v4

    goto :goto_0

    .line 6
    :cond_1
    iget v0, v3, Lv9/a;->a:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/16 v5, -0x3ea

    const-string v3, "Failure2SVDisabled"

    goto :goto_0

    .line 7
    :cond_3
    iget v0, v3, Lv9/a;->a:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    goto :goto_2

    :cond_4
    const/16 v5, -0x3ed

    const-string v3, "Failure2SVFloodCheck"

    goto :goto_0

    .line 8
    :cond_5
    iget v0, v3, Lv9/a;->a:I

    if-eq v0, v1, :cond_7

    const/4 v3, 0x6

    if-eq v0, v3, :cond_6

    goto :goto_2

    .line 9
    :cond_6
    iget-object v0, p0, La9/b$b;->a:La9/b$c;

    invoke-interface {v0}, La9/b$c;->a()V

    const-string v3, "Failure2SVInvalidCode"

    goto :goto_3

    :cond_7
    const/16 v5, -0x3e9

    const-string v3, "Failure2SVUserNotFound"

    goto :goto_0

    :cond_8
    move-object v3, v7

    goto :goto_0

    :goto_3
    if-eqz v3, :cond_9

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SM.callAuthVerify2SVCode() code:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " error:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iget-object v0, p0, La9/b$b;->c:La9/b;

    iget-object v0, v0, La9/b;->a:Lx7/e;

    iget-object v2, p0, La9/b$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v3, v2, p1}, Lx7/e;->a(Ljava/lang/String;Ljava/lang/String;Lh7/j;)V

    if-nez v1, :cond_9

    .line 12
    iget-object p1, p0, La9/b$b;->a:La9/b$c;

    invoke-interface {p1, v5}, La9/b$c;->b(I)V

    :cond_9
    return-void
.end method
