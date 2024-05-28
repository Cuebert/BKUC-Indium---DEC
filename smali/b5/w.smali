.class public final synthetic Lb5/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/c$c;


# instance fields
.field public final synthetic a:Lb5/x;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lb5/x;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/w;->a:Lb5/x;

    iput-wide p2, p0, Lb5/w;->b:J

    iput-wide p4, p0, Lb5/w;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lb5/c$d;)Lg4/l;
    .locals 6

    iget-object v0, p0, Lb5/w;->a:Lb5/x;

    iget-wide v1, p0, Lb5/w;->b:J

    iget-wide v3, p0, Lb5/w;->c:J

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lb5/x;->a(JJLb5/c$d;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
