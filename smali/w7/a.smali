.class public Lw7/a;
.super Lcom/roblox/client/components/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/a$c;,
        Lw7/a$b;,
        Lw7/a$d;,
        Lw7/a$e;
    }
.end annotation


# instance fields
.field private d:Landroid/content/Context;

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Lw7/a$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/roblox/client/components/c;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lw7/a;->d:Landroid/content/Context;

    .line 3
    iput-wide p3, p0, Lw7/a;->e:J

    .line 4
    iput-object p5, p0, Lw7/a;->f:Ljava/lang/String;

    .line 5
    new-instance p1, Lw7/a$d;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lw7/a$d;-><init>(Lw7/a;Lw7/a$a;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/c;->a(Lcom/roblox/client/components/c$a;)V

    .line 6
    new-instance p1, Lw7/a$b;

    invoke-direct {p1, p0}, Lw7/a$b;-><init>(Lw7/a;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/c;->a(Lcom/roblox/client/components/c$a;)V

    .line 7
    new-instance p1, Lw7/a$c;

    iget-object p2, p0, Lw7/a;->f:Ljava/lang/String;

    iget-wide p3, p0, Lw7/a;->e:J

    invoke-direct {p1, p0, p2, p3, p4}, Lw7/a$c;-><init>(Lw7/a;Ljava/lang/String;J)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/components/c;->a(Lcom/roblox/client/components/c$a;)V

    return-void
.end method

.method static synthetic f(Lw7/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lw7/a;->d:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw7/a;->g:Lw7/a$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lw7/a$e;->a()V

    :cond_0
    return-void
.end method

.method public g(Lw7/a$e;)V
    .locals 0

    iput-object p1, p0, Lw7/a;->g:Lw7/a$e;

    return-void
.end method
