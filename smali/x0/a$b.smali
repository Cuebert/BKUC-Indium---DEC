.class Lx0/a$b;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lx0/a;


# direct methods
.method constructor <init>(Lx0/a;)V
    .locals 0

    iput-object p1, p0, Lx0/a$b;->a:Lx0/a;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a$b;->a:Lx0/a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lx0/a;->n:Z

    .line 2
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onInvalidated()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/a$b;->a:Lx0/a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lx0/a;->n:Z

    .line 2
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
