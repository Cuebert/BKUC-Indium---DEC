.class final Lb5/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/d;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method synthetic constructor <init>(Lb5/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lb5/l0;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/j0;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ld5/l;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lb5/l0;

    iget-object v1, p0, Lb5/j0;->a:Landroid/content/Context;

    const/4 v2, 0x0

    .line 2
    invoke-direct {v0, v1, v2}, Lb5/l0;-><init>(Landroid/content/Context;Lb5/k0;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Lb5/j0;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lb5/j0;->a:Landroid/content/Context;

    return-object p0
.end method
