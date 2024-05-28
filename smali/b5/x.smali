.class final Lb5/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lb5/t;


# direct methods
.method constructor <init>(Lb5/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/x;->a:Lb5/t;

    return-void
.end method


# virtual methods
.method final synthetic a(JJLb5/c$d;)Lg4/l;
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/x;->a:Lb5/t;

    invoke-virtual {p5}, Lb5/c$d;->a()Ljava/lang/String;

    move-result-object v1

    move-wide v2, p1

    move-wide v4, p3

    .line 2
    invoke-virtual/range {v0 .. v5}, Lb5/t;->c(Ljava/lang/String;JJ)Lg4/l;

    move-result-object p1

    return-object p1
.end method
