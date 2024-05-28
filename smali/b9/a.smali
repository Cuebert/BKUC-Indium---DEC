.class public Lb9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb9/a$b;
    }
.end annotation


# instance fields
.field private final a:Lh7/m;

.field private b:Z


# direct methods
.method public constructor <init>(Lh7/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb9/a;->b:Z

    .line 3
    iput-object p1, p0, Lb9/a;->a:Lh7/m;

    return-void
.end method

.method static synthetic a(Lb9/a;)Lh7/m;
    .locals 0

    iget-object p0, p0, Lb9/a;->a:Lh7/m;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb9/a;->b:Z

    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    invoke-static {}, Lh7/g;->a()Lh7/f;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->a1()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lb9/a$a;

    invoke-direct {v2, p0}, Lb9/a$a;-><init>(Lb9/a;)V

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lh7/f;->b(Ljava/lang/String;[Lh7/b$a;Lh7/l;)Lh7/c;

    move-result-object v0

    .line 3
    iget-boolean v1, p0, Lb9/a;->b:Z

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Lb9/a$b;

    invoke-direct {v1, v3}, Lb9/a$b;-><init>(Lb9/a$a;)V

    invoke-virtual {v0, v1}, Lh7/a;->g(Lj7/d;)V

    .line 5
    :cond_0
    invoke-virtual {v0}, Lh7/a;->c()V

    return-void
.end method
