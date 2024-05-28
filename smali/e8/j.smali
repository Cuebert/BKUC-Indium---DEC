.class public Le8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le8/j$c;,
        Le8/j$b;
    }
.end annotation


# instance fields
.field private a:Lh7/f;

.field private b:Lx7/e;


# direct methods
.method public constructor <init>(Lh7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le8/j;->a:Lh7/f;

    .line 3
    invoke-static {}, Lx7/e;->h()Lx7/e;

    move-result-object p1

    iput-object p1, p0, Le8/j;->b:Lx7/e;

    return-void
.end method

.method static synthetic a(Le8/j;)Lx7/e;
    .locals 0

    iget-object p0, p0, Le8/j;->b:Lx7/e;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Li7/c;Le8/j$c;)V
    .locals 2

    .line 1
    new-instance v0, Le8/j$a;

    invoke-direct {v0, p0, p3}, Le8/j$a;-><init>(Le8/j;Le8/j$c;)V

    .line 2
    iget-object p3, p0, Le8/j;->a:Lh7/f;

    const/4 v1, 0x0

    invoke-interface {p3, p1, p2, v1, v0}, Lh7/f;->a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lh7/a;->c()V

    .line 4
    iget-object p1, p0, Le8/j;->b:Lx7/e;

    invoke-virtual {p1}, Lx7/e;->O()V

    return-void
.end method
