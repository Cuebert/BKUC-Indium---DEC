.class Lk1/l$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Ljava/lang/String;

.field c:Lk1/r;

.field d:Lk1/h0;

.field e:Lk1/l;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/String;Lk1/l;Lk1/h0;Lk1/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk1/l$d;->a:Landroid/view/View;

    .line 3
    iput-object p2, p0, Lk1/l$d;->b:Ljava/lang/String;

    .line 4
    iput-object p5, p0, Lk1/l$d;->c:Lk1/r;

    .line 5
    iput-object p4, p0, Lk1/l$d;->d:Lk1/h0;

    .line 6
    iput-object p3, p0, Lk1/l$d;->e:Lk1/l;

    return-void
.end method
