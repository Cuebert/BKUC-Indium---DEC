.class public final synthetic Landroidx/camera/core/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/c2$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/e1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw/a1;

.field public final synthetic d:Landroid/util/Size;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/e1;Ljava/lang/String;Lw/a1;Landroid/util/Size;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/d1;->a:Landroidx/camera/core/e1;

    iput-object p2, p0, Landroidx/camera/core/d1;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/core/d1;->c:Lw/a1;

    iput-object p4, p0, Landroidx/camera/core/d1;->d:Landroid/util/Size;

    return-void
.end method


# virtual methods
.method public final a(Lw/c2;Lw/c2$e;)V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/d1;->a:Landroidx/camera/core/e1;

    iget-object v1, p0, Landroidx/camera/core/d1;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/core/d1;->c:Lw/a1;

    iget-object v3, p0, Landroidx/camera/core/d1;->d:Landroid/util/Size;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/e1;->S(Landroidx/camera/core/e1;Ljava/lang/String;Lw/a1;Landroid/util/Size;Lw/c2;Lw/c2$e;)V

    return-void
.end method
