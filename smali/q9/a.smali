.class public Lq9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq9/a;->a:Ljava/lang/String;

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

    const-string v0, "rbx.platform"

    const-string v1, "UserAgentInterceptor.intercept()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-interface {p1}, Lob/a0$a;->e()Lob/g0;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lob/g0;->h()Lob/g0$a;

    move-result-object v0

    iget-object v1, p0, Lq9/a;->a:Ljava/lang/String;

    const-string v2, "User-Agent"

    .line 4
    invoke-virtual {v0, v2, v1}, Lob/g0$a;->b(Ljava/lang/String;Ljava/lang/String;)Lob/g0$a;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lob/g0$a;->a()Lob/g0;

    move-result-object v0

    .line 6
    invoke-interface {p1, v0}, Lob/a0$a;->b(Lob/g0;)Lob/i0;

    move-result-object p1

    return-object p1
.end method
