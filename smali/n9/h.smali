.class public Ln9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field protected a:Lr9/j;

.field protected b:Lr9/d;

.field protected c:Lr9/e;

.field protected d:Lr9/h;

.field protected e:Lr9/i;

.field protected f:Lr9/g;

.field protected g:Lr9/f;

.field protected h:Lr9/m;

.field protected i:Lr9/b;

.field protected j:Lr9/c;

.field protected k:Lr9/a;

.field protected l:Lr9/l;

.field protected m:Lob/d0;

.field protected n:Lgc/c$a;


# direct methods
.method public constructor <init>(Lob/d0;Lgc/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln9/h;->m:Lob/d0;

    .line 3
    iput-object p2, p0, Ln9/h;->n:Lgc/c$a;

    return-void
.end method


# virtual methods
.method public a()Lr9/h;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->d:Lr9/h;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Metrics interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lr9/f;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->g:Lr9/f;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Friends interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lr9/i;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->e:Lr9/i;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Notifications interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Lr9/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->b:Lr9/d;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "CHAT interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lob/d0;)Lr9/g;
    .locals 3

    .line 1
    new-instance v0, Lr9/k;

    invoke-static {}, Ln9/g;->c()Ln9/b;

    move-result-object v1

    iget-object v1, v1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "locale"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object p1

    iget-object v0, p0, Ln9/h;->n:Lgc/c$a;

    .line 3
    invoke-virtual {p1, v0}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object p1

    .line 4
    const-class v0, Lr9/g;

    invoke-virtual {p1, v0}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr9/g;

    if-eqz p1, :cond_0

    return-object p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Locale interface not initialized"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()Lr9/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->i:Lr9/b;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AccountSettings interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lr9/l;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->l:Lr9/l;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Thumbnails interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Lr9/j;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->a:Lr9/j;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "PlatformChat interface not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Ln9/b;)Ln9/d;
    .locals 3

    .line 1
    iget-object v0, p0, Ln9/h;->a:Lr9/j;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "apis"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 3
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 4
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 5
    const-class v1, Lr9/j;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/j;

    iput-object v0, p0, Ln9/h;->a:Lr9/j;

    .line 6
    :cond_0
    iget-object v0, p0, Ln9/h;->b:Lr9/d;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "chat"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 8
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 9
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 10
    const-class v1, Lr9/d;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/d;

    iput-object v0, p0, Ln9/h;->b:Lr9/d;

    .line 11
    :cond_1
    iget-object v0, p0, Ln9/h;->c:Lr9/e;

    if-nez v0, :cond_2

    .line 12
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "clientsettings.api"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 13
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 14
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 15
    const-class v1, Lr9/e;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/e;

    iput-object v0, p0, Ln9/h;->c:Lr9/e;

    .line 16
    :cond_2
    iget-object v0, p0, Ln9/h;->d:Lr9/h;

    if-nez v0, :cond_3

    .line 17
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "metrics"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 18
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 19
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 20
    const-class v1, Lr9/h;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/h;

    iput-object v0, p0, Ln9/h;->d:Lr9/h;

    .line 21
    :cond_3
    iget-object v0, p0, Ln9/h;->e:Lr9/i;

    if-nez v0, :cond_4

    .line 22
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "notifications"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 23
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 24
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 25
    const-class v1, Lr9/i;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/i;

    iput-object v0, p0, Ln9/h;->e:Lr9/i;

    .line 26
    :cond_4
    iget-object v0, p0, Ln9/h;->f:Lr9/g;

    if-nez v0, :cond_5

    .line 27
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "locale"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 28
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 29
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 30
    const-class v1, Lr9/g;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/g;

    iput-object v0, p0, Ln9/h;->f:Lr9/g;

    .line 31
    :cond_5
    iget-object v0, p0, Ln9/h;->g:Lr9/f;

    if-nez v0, :cond_6

    .line 32
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "friends"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 33
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 34
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 35
    const-class v1, Lr9/f;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/f;

    iput-object v0, p0, Ln9/h;->g:Lr9/f;

    .line 36
    :cond_6
    iget-object v0, p0, Ln9/h;->h:Lr9/m;

    if-nez v0, :cond_7

    .line 37
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "translations"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 38
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 39
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 40
    const-class v1, Lr9/m;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/m;

    iput-object v0, p0, Ln9/h;->h:Lr9/m;

    .line 41
    :cond_7
    iget-object v0, p0, Ln9/h;->i:Lr9/b;

    if-nez v0, :cond_8

    .line 42
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "accountsettings"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 43
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 44
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 45
    const-class v1, Lr9/b;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/b;

    iput-object v0, p0, Ln9/h;->i:Lr9/b;

    .line 46
    :cond_8
    iget-object v0, p0, Ln9/h;->j:Lr9/c;

    if-nez v0, :cond_9

    .line 47
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "auth"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 48
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 49
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 50
    const-class v1, Lr9/c;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/c;

    iput-object v0, p0, Ln9/h;->j:Lr9/c;

    .line 51
    :cond_9
    iget-object v0, p0, Ln9/h;->k:Lr9/a;

    if-nez v0, :cond_a

    .line 52
    new-instance v0, Lr9/k;

    iget-object v1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v2, "accountinformation"

    invoke-direct {v0, v2, v1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ln9/h;->m:Lob/d0;

    .line 53
    invoke-virtual {v0, v1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object v0

    iget-object v1, p0, Ln9/h;->n:Lgc/c$a;

    .line 54
    invoke-virtual {v0, v1}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object v0

    .line 55
    const-class v1, Lr9/a;

    invoke-virtual {v0, v1}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/a;

    iput-object v0, p0, Ln9/h;->k:Lr9/a;

    .line 56
    :cond_a
    iget-object v0, p0, Ln9/h;->l:Lr9/l;

    if-nez v0, :cond_b

    .line 57
    new-instance v0, Lr9/k;

    iget-object p1, p1, Ln9/b;->a:Ljava/lang/String;

    const-string v1, "thumbnails"

    invoke-direct {v0, v1, p1}, Lr9/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Ln9/h;->m:Lob/d0;

    .line 58
    invoke-virtual {v0, p1}, Lr9/k;->f(Lob/d0;)Lr9/k;

    move-result-object p1

    iget-object v0, p0, Ln9/h;->n:Lgc/c$a;

    .line 59
    invoke-virtual {p1, v0}, Lr9/k;->e(Lgc/c$a;)Lr9/k;

    move-result-object p1

    .line 60
    const-class v0, Lr9/l;

    invoke-virtual {p1, v0}, Lr9/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr9/l;

    iput-object p1, p0, Ln9/h;->l:Lr9/l;

    :cond_b
    return-object p0
.end method
