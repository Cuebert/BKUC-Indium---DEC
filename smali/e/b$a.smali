.class Le/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Le/b;


# direct methods
.method constructor <init>(Le/b;)V
    .locals 0

    iput-object p1, p0, Le/b$a;->n:Le/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public v(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Le/b$a;->n:Le/b;

    invoke-virtual {v0, p1}, Le/b;->c(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
