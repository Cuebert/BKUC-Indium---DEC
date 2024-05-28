.class public Ly8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/b$b;
    }
.end annotation


# instance fields
.field private a:Lz8/a;

.field private b:Ly8/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lz8/a;

    invoke-direct {v0}, Lz8/a;-><init>()V

    iput-object v0, p0, Ly8/b;->a:Lz8/a;

    return-void
.end method

.method static synthetic a(Ly8/b;Ly8/f;)V
    .locals 0

    invoke-direct {p0, p1}, Ly8/b;->c(Ly8/f;)V

    return-void
.end method

.method private c(Ly8/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/b;->b:Ly8/b$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Ly8/b$b;->a(Ly8/f;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Ly8/b$b;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ly8/b;->b:Ly8/b$b;

    .line 2
    iget-object p1, p0, Ly8/b;->a:Lz8/a;

    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object v0

    invoke-virtual {v0}, Lb9/c;->j()J

    move-result-wide v0

    new-instance v2, Ly8/b$a;

    invoke-direct {v2, p0}, Ly8/b$a;-><init>(Ly8/b;)V

    invoke-virtual {p1, v0, v1, v2}, Lz8/a;->d(JLy8/a;)V

    return-void
.end method
