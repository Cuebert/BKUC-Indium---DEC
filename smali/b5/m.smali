.class final Lb5/m;
.super Ld5/y;
.source "SourceFile"


# instance fields
.field final synthetic o:Landroid/content/Context;

.field final synthetic p:Lb5/t;


# direct methods
.method constructor <init>(Lb5/t;Lg4/m;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lb5/m;->p:Lb5/t;

    iput-object p3, p0, Lb5/m;->o:Landroid/content/Context;

    invoke-direct {p0, p2}, Ld5/y;-><init>(Lg4/m;)V

    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 2

    iget-object v0, p0, Lb5/m;->p:Lb5/t;

    invoke-static {v0}, Lb5/t;->e(Lb5/t;)Lg4/m;

    move-result-object v0

    iget-object v1, p0, Lb5/m;->o:Landroid/content/Context;

    invoke-static {v1}, Ld5/h;->a(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg4/m;->e(Ljava/lang/Object;)Z

    return-void
.end method
