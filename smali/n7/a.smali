.class public Ln7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw6/c;


# static fields
.field private static g:I


# instance fields
.field private a:Ljava/lang/StringBuilder;

.field private b:Ljava/lang/StringBuilder;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:J

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    .line 3
    iput-object v0, p0, Ln7/a;->b:Ljava/lang/StringBuilder;

    const-string v0, ""

    .line 4
    iput-object v0, p0, Ln7/a;->c:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ln7/a;->d:Z

    const-wide/16 v0, 0x0

    .line 6
    iput-wide v0, p0, Ln7/a;->e:J

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln7/a;->f:Ljava/util/ArrayList;

    .line 8
    iput-object p1, p0, Ln7/a;->c:Ljava/lang/String;

    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ln7/a;->b:Ljava/lang/StringBuilder;

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static i()V
    .locals 2

    .line 1
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->H0()Z

    move-result v0

    const/16 v1, 0x64

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    sput v0, Ln7/a;->g:I

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    sput v0, Ln7/a;->g:I

    :goto_0
    return-void
.end method

.method private j()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    mul-long v0, v0, v2

    return-wide v0
.end method

.method private static l()Z
    .locals 2

    sget v0, Ln7/a;->g:I

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->b0()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private m(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ","

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v0

    invoke-interface {v0}, Lc7/e;->A0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Lw6/a;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ln7/a;->d:Z

    if-nez v0, :cond_1

    invoke-static {}, Ln7/a;->l()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lw6/a;->a()V

    :cond_0
    return-void

    .line 3
    :cond_1
    iget-wide v0, p0, Ln7/a;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    .line 4
    invoke-direct {p0}, Ln7/a;->j()J

    move-result-wide v0

    iput-wide v0, p0, Ln7/a;->e:J

    .line 5
    :cond_2
    new-instance v0, Lx8/b;

    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->A0()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v2

    invoke-interface {v2}, Lc7/e;->c1()I

    move-result v2

    invoke-virtual {p0}, Ln7/a;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ln7/a$a;

    invoke-direct {v4, p0, p1}, Ln7/a$a;-><init>(Ln7/a;Lw6/a;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lx8/b;-><init>(Ljava/lang/String;ILjava/lang/String;Lx8/a;)V

    .line 7
    invoke-virtual {v0}, Lx8/b;->d()V

    return-void
.end method

.method public c(Ljava/lang/String;I)Ln7/a;
    .locals 1

    iget-object v0, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "i,"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public d(Ljava/lang/String;J)Ln7/a;
    .locals 1

    iget-object v0, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "i,"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;
    .locals 1

    iget-object v0, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public f(Ljava/lang/String;Z)Ln7/a;
    .locals 1

    iget-object v0, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;
    .locals 2

    iget-object v0, p0, Ln7/a;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, " "

    const-string v1, "\\ "

    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string p2, ","

    const-string v1, "\\,"

    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public h()Lw6/c;
    .locals 1

    invoke-static {}, Ln7/b;->d()Ln7/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw6/b;->b(Lw6/c;)V

    return-object p0
.end method

.method protected k()Ljava/lang/String;
    .locals 5

    const-string v0, "appVersion"

    const-string v1, "2.622.471"

    .line 1
    invoke-virtual {p0, v0, v1}, Ln7/a;->g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    .line 2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "deviceType"

    invoke-virtual {p0, v1, v0}, Ln7/a;->e(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "deviceOSVersion"

    invoke-virtual {p0, v1, v0}, Ln7/a;->g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    const-string v0, "platform"

    const-string v1, "Android"

    .line 4
    invoke-virtual {p0, v0, v1}, Ln7/a;->g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    const-string v0, "reporter"

    const-string v1, "App"

    .line 5
    invoke-virtual {p0, v0, v1}, Ln7/a;->g(Ljava/lang/String;Ljava/lang/Object;)Ln7/a;

    .line 6
    iget-wide v0, p0, Ln7/a;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 7
    invoke-direct {p0}, Ln7/a;->j()J

    move-result-wide v0

    iput-wide v0, p0, Ln7/a;->e:J

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 9
    :goto_0
    iget-object v2, p0, Ln7/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 10
    iget-object v2, p0, Ln7/a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ln7/a;->c:Ljava/lang/String;

    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ","

    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ln7/a;->b:Ljava/lang/StringBuilder;

    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ln7/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ln7/a;->a:Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Ln7/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ln7/a;->e:J

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n(Z)Ln7/a;
    .locals 0

    iput-boolean p1, p0, Ln7/a;->d:Z

    return-object p0
.end method
