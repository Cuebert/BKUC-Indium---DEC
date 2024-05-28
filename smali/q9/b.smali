.class public Lq9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# static fields
.field private static b:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.platform"

    .line 2
    iput-object v0, p0, Lq9/b;->a:Ljava/lang/String;

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lq9/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method private c(Lob/g0;Ljava/lang/String;)Lob/g0;
    .locals 2

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p1}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "POST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "XSRFTokenInterceptor.putXSRFTokenInRequest() token:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lq9/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.platform"

    invoke-static {v1, v0}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p1}, Lob/g0;->h()Lob/g0$a;

    move-result-object p1

    const-string v0, "X-CSRF-TOKEN"

    invoke-virtual {p1, v0, p2}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    move-result-object p1

    invoke-virtual {p1}, Lob/g0$a;->a()Lob/g0;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lq9/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lob/a0$a;)Lob/i0;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object v0

    invoke-static {}, Lq9/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lq9/b;->c(Lob/g0;Ljava/lang/String;)Lob/g0;

    move-result-object v0

    .line 2
    invoke-interface {p1, v0}, Lob/a0$a;->b(Lob/g0;)Lob/i0;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lob/i0;->e()I

    move-result v0

    const/16 v1, 0x193

    if-ne v0, v1, :cond_0

    const-string v0, "X-CSRF-TOKEN"

    .line 4
    invoke-virtual {p1, v0}, Lob/i0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "XSRFTokenInterceptor.intercept() new token:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.platform"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {v0}, Lq9/b;->d(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method
