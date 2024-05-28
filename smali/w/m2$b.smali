.class final Lw/m2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/m2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lw/c2;

.field private b:Z

.field private c:Z


# direct methods
.method constructor <init>(Lw/c2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lw/m2$b;->b:Z

    .line 3
    iput-boolean v0, p0, Lw/m2$b;->c:Z

    .line 4
    iput-object p1, p0, Lw/m2$b;->a:Lw/c2;

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-boolean v0, p0, Lw/m2$b;->c:Z

    return v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lw/m2$b;->b:Z

    return v0
.end method

.method c()Lw/c2;
    .locals 1

    iget-object v0, p0, Lw/m2$b;->a:Lw/c2;

    return-object v0
.end method

.method d(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/m2$b;->c:Z

    return-void
.end method

.method e(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/m2$b;->b:Z

    return-void
.end method
