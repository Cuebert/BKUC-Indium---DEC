.class public final synthetic Landroidx/camera/core/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/c2$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/n0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw/z0;

.field public final synthetic d:Landroid/util/Size;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/n0;Ljava/lang/String;Lw/z0;Landroid/util/Size;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/l0;->a:Landroidx/camera/core/n0;

    iput-object p2, p0, Landroidx/camera/core/l0;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/core/l0;->c:Lw/z0;

    iput-object p4, p0, Landroidx/camera/core/l0;->d:Landroid/util/Size;

    return-void
.end method


# virtual methods
.method public final a(Lw/c2;Lw/c2$e;)V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/l0;->a:Landroidx/camera/core/n0;

    iget-object v1, p0, Landroidx/camera/core/l0;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/core/l0;->c:Lw/z0;

    iget-object v3, p0, Landroidx/camera/core/l0;->d:Landroid/util/Size;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/n0;->L(Landroidx/camera/core/n0;Ljava/lang/String;Lw/z0;Landroid/util/Size;Lw/c2;Lw/c2$e;)V

    return-void
.end method
