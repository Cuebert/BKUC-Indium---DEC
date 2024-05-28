.class Lb9/a$b;
.super Lj7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj7/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb9/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lb9/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lh7/j;

    invoke-virtual {p0, p1}, Lb9/a$b;->e(Lh7/j;)Z

    move-result p1

    return p1
.end method

.method public e(Lh7/j;)Z
    .locals 2

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lh7/j;->b()I

    move-result p1

    const/16 v0, 0x191

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
