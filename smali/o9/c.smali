.class public Lo9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/e;


# instance fields
.field private a:Lob/p;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lo9/c;-><init>(Lob/p;)V

    return-void
.end method

.method public constructor <init>(Lob/p;)V
    .locals 2

    .line 2
    invoke-static {}, Ln9/g;->e()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-direct {p0, p1, v1, v1, v0}, Lo9/c;-><init>(Lob/p;IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lob/p;IILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lo9/c;->a:Lob/p;

    .line 5
    iput p2, p0, Lo9/c;->b:I

    .line 6
    iput p3, p0, Lo9/c;->c:I

    .line 7
    iput-object p4, p0, Lo9/c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lob/d0;
    .locals 4

    .line 1
    new-instance v0, Lzb/a;

    new-instance v1, Lo9/c$a;

    invoke-direct {v1, p0}, Lo9/c$a;-><init>(Lo9/c;)V

    invoke-direct {v0, v1}, Lzb/a;-><init>(Lzb/a$b;)V

    .line 2
    sget-object v1, Lzb/a$a;->q:Lzb/a$a;

    invoke-virtual {v0, v1}, Lzb/a;->d(Lzb/a$a;)Lzb/a;

    .line 3
    new-instance v1, Lob/d0$b;

    invoke-direct {v1}, Lob/d0$b;-><init>()V

    .line 4
    invoke-virtual {v1, v0}, Lob/d0$b;->a(Lob/a0;)Lob/d0$b;

    .line 5
    iget-object v0, p0, Lo9/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 6
    new-instance v2, Lq9/a;

    invoke-direct {v2, v0}, Lq9/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lob/d0$b;->b(Lob/a0;)Lob/d0$b;

    .line 7
    :cond_0
    new-instance v0, Lq9/b;

    invoke-direct {v0}, Lq9/b;-><init>()V

    invoke-virtual {v1, v0}, Lob/d0$b;->b(Lob/a0;)Lob/d0$b;

    .line 8
    iget v0, p0, Lo9/c;->b:I

    int-to-long v2, v0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v0}, Lob/d0$b;->e(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;

    .line 9
    iget v2, p0, Lo9/c;->c:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3, v0}, Lob/d0$b;->i(JLjava/util/concurrent/TimeUnit;)Lob/d0$b;

    .line 10
    iget-object v0, p0, Lo9/c;->a:Lob/p;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lo9/i;->e()Lo9/i;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Lob/d0$b;->f(Lob/p;)Lob/d0$b;

    const/4 v0, 0x0

    .line 11
    invoke-virtual {v1, v0}, Lob/d0$b;->h(Z)Lob/d0$b;

    .line 12
    invoke-virtual {v1}, Lob/d0$b;->c()Lob/d0;

    move-result-object v0

    return-object v0
.end method
