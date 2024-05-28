.class Lb2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lk2/a;

.field private final c:Lk2/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lk2/a;Lk2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb2/i;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lb2/i;->b:Lk2/a;

    .line 4
    iput-object p3, p0, Lb2/i;->c:Lk2/a;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lb2/h;
    .locals 3

    iget-object v0, p0, Lb2/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lb2/i;->b:Lk2/a;

    iget-object v2, p0, Lb2/i;->c:Lk2/a;

    invoke-static {v0, v1, v2, p1}, Lb2/h;->a(Landroid/content/Context;Lk2/a;Lk2/a;Ljava/lang/String;)Lb2/h;

    move-result-object p1

    return-object p1
.end method
